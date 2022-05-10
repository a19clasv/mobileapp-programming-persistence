package com.example.persistence;

class DatabaseTables {

    static class Country {

        static final String TABLE_NAME = "country";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_NATIONAL_DAY = "national day";
        static final String COLUMN_NAME_CAPITAL = "capital";

    }

    static final String SQL_CREATE_TABLE_COUNTRY =
            // "CREATE TABLE mountain (name TEXT PRIMARY KEY, national day TEXT, capital TEXT)"
            "CREATE TABLE " + Country.TABLE_NAME + " (" +
                    Country.COLUMN_NAME_NAME + " TEXT PRIMARY KEY," +
                    Country.COLUMN_NAME_NATIONAL_DAY + " TEXT," +
                    Country.COLUMN_NAME_CAPITAL + " TEXT)";

    static final String SQL_DELETE_TABLE_MOUNTAIN =
            // "DROP TABLE IF EXISTS mountain"
            "DROP TABLE IF EXISTS " + Country.TABLE_NAME;

}
