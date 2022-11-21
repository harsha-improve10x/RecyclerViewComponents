package com.example.recyclerviewcomponents.groceries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class GroceriesActivity extends AppCompatActivity {

    public ArrayList<Grocery> groceries;
    public RecyclerView groceriesRv;
    public GroceriesAdapter groceriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
        getSupportActionBar().hide();
        setGroceriesData();
        setGroceriesRv();
    }

    public void setGroceriesRv() {
        groceriesRv = findViewById(R.id.groceries_rv);
        groceriesRv.setLayoutManager(new GridLayoutManager(this, 3));
        groceriesAdapter = new GroceriesAdapter();
        groceriesAdapter.setGroceries(groceries);
        groceriesRv.setAdapter(groceriesAdapter);
    }

    public void setGroceriesData() {
        groceries = new ArrayList<>();

        Grocery freshFruits = new Grocery();
        freshFruits.item = "Fresh Fruits";
        freshFruits.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-fruits-3b26c10dc05d15fbe45ceb3d0eaa816d.png";
        groceries.add(freshFruits);

        Grocery onionsAndTomatoes = new Grocery();
        onionsAndTomatoes.item = "Onions & Tomatoes";
        onionsAndTomatoes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-onions-and-tomatos-1986e0017a966f57a20fce08853c25ad.png";
        groceries.add(onionsAndTomatoes);

        Grocery freshVegetables = new Grocery();
        freshVegetables.item = "Fresh Vegetables";
        freshVegetables.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-vegetables-9799bef8ba92fd03c53f0546ae404a55.png";
        groceries.add(freshVegetables);

        Grocery exoticFruits = new Grocery();
        exoticFruits.item = "Exotic Fruits";
        exoticFruits.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-exotic-fruits-d5fb208beef0323598ebd4e0c676d2b8.png";
        groceries.add(exoticFruits);

        Grocery mangoes = new Grocery();
        mangoes.item = "Mangoes";
        mangoes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mangoes-5dec36e3d054464908f125421f2748c2.png";
        groceries.add(mangoes);

        Grocery dairy = new Grocery();
        dairy.item = "Dairy";
        dairy.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-dairy-91f031697f2e433799e567f021460f9b.png";
        groceries.add(dairy);

        Grocery breadAndBuns = new Grocery();
        breadAndBuns.item = "Bread & Buns";
        breadAndBuns.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-bread-and-buns-ea6fc0dcbc8cd860c88cc1310c64e8d6.png";
        groceries.add(breadAndBuns);

        Grocery cerealsAndOats = new Grocery();
        cerealsAndOats.item = "Cereals & Oats";
        cerealsAndOats.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cereal-and-oats-4578a048785cef3231ce946e0385e320.png";
        groceries.add(cerealsAndOats);

        Grocery healthDrinks = new Grocery();
        healthDrinks.item = "Health Drinks";
        healthDrinks.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-horlicks-25492b5096ad52bcd21607c6fc3f03d9.png";
        groceries.add(healthDrinks);

        Grocery readyToEat = new Grocery();
        readyToEat.item = "Ready-to-Eat";
        readyToEat.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-ready-to-eat-9f44b2f69ef008732be5de955293bfe5.png";
        groceries.add(readyToEat);

        Grocery biscuitsAndCookies = new Grocery();
        biscuitsAndCookies.item = "Biscuits & Cookies";
        biscuitsAndCookies.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-biscuits-and-cookies-ee0423b9d3478a4c7499cf7f1d32e4bf.png";
        groceries.add(biscuitsAndCookies);

        Grocery chipsAndNamkeen = new Grocery();
        chipsAndNamkeen.item = "Chips & Namkeen";
        chipsAndNamkeen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chips-and-namkeen-e3d8b0e18b4b6721cc565d03922ca3d5.png";
        groceries.add(chipsAndNamkeen);

        Grocery teaAndCoffee = new Grocery();
        teaAndCoffee.item = "Tea & Coffee";
        teaAndCoffee.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-tea-and-coffee-683381e7427398452e760dfb6c816e1e.png";
        groceries.add(teaAndCoffee);

        Grocery softDrinksAndJuice = new Grocery();
        softDrinksAndJuice.item = "Soft Drinks & Juice";
        softDrinksAndJuice.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-softdrinks-and-juice-09a3e724b1b1851ffe9747d4c03eb3b7.png";
        groceries.add(softDrinksAndJuice);

        Grocery energyAndSportsDrinks = new Grocery();
        energyAndSportsDrinks.item = "Energy & Sports Drinks";
        energyAndSportsDrinks.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-energy-and-sportsdrinks-8dc82b984a9a536206aa8685dce463b8.png";
        groceries.add(energyAndSportsDrinks);

        Grocery attaAndFlours = new Grocery();
        attaAndFlours.item = "Atta & Flours";
        attaAndFlours.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-atta-and-flours-b85c359a33d1a017df2ddc830dbb3172.png";
        groceries.add(attaAndFlours);

        Grocery bakingEssentials = new Grocery();
        bakingEssentials.item = "Baking Essentials";
        bakingEssentials.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-baking-essentials-5b3a70840b2f29a6bfd8f08bbc62c339.png";
        groceries.add(bakingEssentials);

        Grocery cookingPastes = new Grocery();
        cookingPastes.item = "Cooking Pastes";
        cookingPastes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cooking-pastes-75b2e7ccc1255261d1a277d63209b1ae.png";
        groceries.add(cookingPastes);

        Grocery masalaAndSpices = new Grocery();
        masalaAndSpices.item = "Masala & Spices";
        masalaAndSpices.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-masala-and-spices-985e3e74c25545edecc6e13b3f3728fb.png";
        groceries.add(masalaAndSpices);

        Grocery cannedFruitsAndVegetables = new Grocery();
        cannedFruitsAndVegetables.item = "Canned Fruits & Vegetables";
        cannedFruitsAndVegetables.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-canned-fruit-and-vegetables-c6adef7534b8faa7100c671daab54e2f.png";
        groceries.add(cannedFruitsAndVegetables);

        Grocery chicken = new Grocery();
        chicken.item = "Chicken";
        chicken.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chicken-8883976089fb7016f8b1e0f058fcdd8a.png";
        groceries.add(chicken);

        Grocery fishAndSeaFood = new Grocery();
        fishAndSeaFood.item = "Fish & Seafood";
        fishAndSeaFood.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fish-and-seafood-b692e65b128c6dc49d42a4c39b8dac92.png";
        groceries.add(fishAndSeaFood);

        Grocery mutton = new Grocery();
        mutton.item = "Mutton";
        mutton.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mutton-af19fffe878f5d0e057cc44865967cb5.png";
        groceries.add(mutton);

        Grocery marinatedCuts = new Grocery();
        marinatedCuts.item = "Marinated Cuts";
        marinatedCuts.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-marinated-cuts-daf965857a0904ab3cc263e2e3c1f672.png";
        groceries.add(marinatedCuts);

        Grocery eggs = new Grocery();
        eggs.item = "eggs";
        eggs.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-eggs-e1f42bcafd6d5cd04084de21bad9c494.png";
        groceries.add(eggs);
    }
}