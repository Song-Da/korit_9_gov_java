package com.korit.study.ch27;

import java.util.Locale;
import java.util.Objects;

public class Product {
    private final String name;
    private final Integer price;
    private final String size;

    public Product(String name, Integer price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public static Locale.Builder builder() {
        return new Locale.Builder(); // 습...ㅋ
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(size, product.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, size);
    }
}

/**
 *
 */