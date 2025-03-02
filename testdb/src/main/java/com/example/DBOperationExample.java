package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperationExample {
    public void fetchData() {
        // ① try-with-resourcesでDB接続情報をドライバマネージャ経由で取得
        try (Connection connection = MyDriverManager.getConnection()){

            // ② ステートメントを作成（SQLを実行するための関数が詰め込まれたクラス）
            Statement statement = connection.createStatement();

            // ③ SQLを実行して結果を取得
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NewEmployee");

            // ③ 結果を出力
            while (resultSet.next()) {
                // ③-1 カラム名をもとにデータを取得
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");

                // ③-2 取得したデータを標準出力
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
