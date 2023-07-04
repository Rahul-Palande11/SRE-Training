def call(String Url, String branch) {
    stages {
      stage(cloning) {
            git url: "${Url}", branch: "${branch}"
            echo "Clonning done"
      }
    
    }
}
