public abstract class HiringConnection{
  
  // Factory method
  abstract protected DatabaseConnector makeConnection();

  public void takeConnection(String query){
    DatabaseConnector conexao = this.makeConnection();
    conexao.createConnection();
    conexao.runQuery(query);
  }

}