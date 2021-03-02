public abstract class BuildReport{

  public void build() {
      this.createDatabaseConnection();
      this.executeQuery();
      this.convertArchive();
  }

  abstract public void createDatabaseConnection();
  abstract public void executeQuery();
  abstract public void convertArchive();

}