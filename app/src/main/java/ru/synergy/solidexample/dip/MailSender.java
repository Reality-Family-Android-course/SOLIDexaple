package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;

public interface MailSender {
    void sendConfirmationEmail(Order order);
}
