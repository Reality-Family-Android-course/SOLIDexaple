package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;
import ru.synergy.solidexample.srp.wrong.MySqlConnection;

public class MySQLOrderRepository implements OrderRepository {

    @Override
    public boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // сохраняем заказ в базу данных

        return true;
    }
}

