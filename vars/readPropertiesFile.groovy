// vars/readPropertiesFile.groovy

def call(String filePath) {
  def props = new Properties()
  fileExistsOrDie(filePath)
  props.load(new FileInputStream(filePath))

  // Set each property as an environment variable
  props.each { key, value ->
    env."${key}" = "${value}"
  }
}

def fileExistsOrDie(String filePath) {
  if (!fileExists(filePath)) {
    throw new FileNotFoundException("File not found: ${filePath}")
  }
}

def fileExists(String filePath) {
  def file = new File(filePath)
  return file.exists()
}