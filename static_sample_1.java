public class ExpensiveResourceManager {

  // Static expensive resource (eager initialization)
  private static final ExpensiveResource resource = new ExpensiveResource();

  public static ExpensiveResource getResource() {
    return resource;
  }

  // Simulate an expensive resource (e.g., could be a DB connection, thread pool, etc.)
  public static class ExpensiveResource {}
}

public class MainApp {
  public static void main(String[] args) {
    ExpensiveResourceManager.getResource().performAction();
    // live long …
  }
}
