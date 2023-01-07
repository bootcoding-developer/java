package com.bootcoding.java.assignments;

public class DiscountSystem {

    // Get Discount based on how customer do shopping frequently
    // if customer shopping frequency is above 8 , provide discount 50%
    // if customer shopping frequency is above 5, provide discount 30%
    // if customer shopping frequency is above 2, provide discount 10%
    // if customer shopping frequency is below 2, provide discount 0%

    public static String getDiscount(int countOfShopping){
        if(countOfShopping >= 8){
            return "50%";
        }
        if(countOfShopping >= 5){
            return "30%";
        }
        if(countOfShopping >= 2){
            return "10%";
        }
        return "0%";
    }

    public static String[] getDiscounts(int[] shoppingCounts){ // int[] shoppingCounts = {10, 20, 2, 4, 0, 6}
        String[] customerDiscounts = new String[shoppingCounts.length];
        for(int i = 0; i < shoppingCounts.length; i++){
            String discount = getDiscount(shoppingCounts[i]);
            customerDiscounts[i] = discount;
        }
        return customerDiscounts;
    }

    public static void main(String[] args) {
        int[] shoppings = {10, 20, 2, 4, 0, 6};

        String[] discounts = getDiscounts(shoppings);
        for(int i = 0; i<discounts.length; i++){
            System.out.println("Shopping Count="+shoppings[i]+ "->"+discounts[i]  +" Discount");
        }
    }



}
