package com.week2.mockito;
public class UserService {
    private NotificationService notificationService;
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void registerUser(String username) {
        notificationService.sendNotification("Welcome " + username);
    }
}