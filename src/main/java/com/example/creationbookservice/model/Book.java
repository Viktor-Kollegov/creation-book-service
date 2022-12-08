package com.example.creationbookservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String name;
    private String description;
    private String status;
    private int price;

    public static Book.Builder builder() {
        return new Book().new Builder();
    }

    public final class Builder {

        public Book.Builder id(int id) {
            Book.this.id = id;
            return this;
        }

        public Book.Builder name(String name) {
            Book.this.name = name;
            return this;
        }

        public Book.Builder description(String description) {
            Book.this.description = description;
            return this;
        }

        public Book.Builder status(String status) {
            Book.this.status = status;
            return this;
        }

        public Book.Builder price(int price) {
            Book.this.price = price;
            return this;
        }

        public Book build() {
            return Book.this;
        }
    }

}
