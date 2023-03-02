package com.example.appsale.data.remote;

public class AppResource<T> {
    public T data;
    public String message;
    public Status status;

    public AppResource(T data, Status status) {
        this.data = data;
        this.status = status;
    }

    public AppResource(String message, Status status) {
        this.message = message;
        this.status = status;
    }

    public static class Success<T> extends AppResource<T> {
        public Success(T data) {
            super(data, Status.SUCCESS);
        }
    }

    public static class Error<T> extends AppResource<T> {
        public Error(String message) {
            super(message, Status.ERROR);
        }
    }

    public static class Loading<T> extends AppResource<T> {
        public Loading(T data) {
            super(data, Status.LOADING);
        }
    }

    public enum Status {
        SUCCESS, LOADING, ERROR
    }
}