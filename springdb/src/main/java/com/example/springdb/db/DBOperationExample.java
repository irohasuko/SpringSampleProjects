package com.example.springdb.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.springdb.model.User;

public class DBOperationExample {
    public ArrayList<User> fetchUser() {
        try (Connection connection = MyDriverManager.getConnection()){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT ID, NAME FROM NewEmployee");

            // 結果格納用のArrayListを作成
            ArrayList<User> userList = new ArrayList<>();
            
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");

                // 結果をUserオブジェクトに格納
                userList.add(new User(id, name));
            }

            return userList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
