package com.saucedemo.models;

public class ProductsModel {

        private String productName;

        public ProductsModel() {}

        public ProductsModel(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }

