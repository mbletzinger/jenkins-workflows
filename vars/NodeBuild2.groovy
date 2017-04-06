// 'node:4.8.2-alpine'
// Don't use'
def call() {
// Run all this in a single node
node("docker") {
    docker.image("node:4.8.2-alpine").inside {
      //echo "Running on ${nodeName}"
      NotifyWrapper {
      stage ("Project checkout") {
          checkout scm
      }
      sh "node -v"
      NodeBuildStep()
      }
    }
  }
}