package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;
import br.edu.ifpb.report.factories.HiringConnection;

public class ExpenseReport extends BuildReport{

    HiringConnection connectorPostgreSQL = new PostgreSQLManager();

    @Override 
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connectorPostgreSQL.createConnection();
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connectorPostgreSQL.runQuery(query);
    }

    @Override
    public void convertArchive() {
        System.out.println("Converting To XLS...");
    }

}
