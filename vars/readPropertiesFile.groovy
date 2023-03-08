// vars/readPropertiesFile.groovy

def call(String filePath) {
  def props = new Properties()
  fileExistsOrDie(filePath)
  props.load(new FileInputStream(filePath))

  return props
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
