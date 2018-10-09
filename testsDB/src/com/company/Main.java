package com.company;

public class Main {

    public static void main(String[] args) {
//	    Db.conect("data.db");
//	    Db.createNewDatabase("test2.db");
//        Db.createNewTable();

//        InsertApp app = new InsertApp();

//        app.insert("Ovos", 10000);
//        app.insert("Acucar", 3000);
//        app.insert("Alcool", 4000);
//        app.insert("Farinha", 5000);

//        SelectApp app = new SelectApp();

//        app.selectAll();
//        app.getCapacityGreaterThan(3600);

//        UpdateApp app = new UpdateApp();

//        app.update(3, "Farinha", 4300);

//        DeleteApp app = new DeleteApp();
//        app.delete(5);

        //Testar meu CRUD na tabela users no banco data.db
        CRUD users = new CRUD();

//        users.insert("marcossouza", "teste123");
//        users.insert("rogerio", "teste12");
//        users.insert("evandrovercosa", "teste234");

        users.selectAll();

//        users.selectUser("marcossouza");
//        users.updatePass("marcossouza", "teste000");
//        users.selectUser("marcossouza");

//        users.deleteUser("rogerio");
//        users.selectAll();


    }
}
