public class PostgreSQLManager extends HiringConnection{
  @Override
  protected DatabaseConnector makeConnection(){
    return new PostgreSQLDatabaseConnector();
  }
}