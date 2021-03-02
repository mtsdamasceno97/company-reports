package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.factories.HiringConnection;

public class TaxReport extends BuildReport{

    HiringConnection connectorMysql = new MysqlManager();

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connectorMysql.createConnection();
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connectorMysql.runQuery(query);
    }

    @Override
    public void convertArchive() {
        System.out.println("Converting To PDF...");
    }
}
