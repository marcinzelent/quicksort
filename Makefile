PROJECT_NAME = quicksort

SRC_DIR	:= src/main/java/$(PROJECT_NAME)
TARGET_DIR := target
CLASSES_DIR := $(TARGET_DIR)/classes

SRC = $(wildcard $(SRC_DIR)/*.java)
CLASSES = $(patsubst $(SRC_DIR)/%.java, $(CLASSES_DIR)/$(PROJECT_NAME)/%.class, $(SRC))

JC = javac
JFLAGS = -g -d $(CLASSES_DIR)
JAR = jar cvf

all: compile

clean:
	@echo "[INFO] Cleaning target directory"
	@rm -rf $(TARGET_DIR)

setup: clean
	@echo "[INFO] Creating classes directory"
	@mkdir -p $(CLASSES_DIR)

compile: setup
	@echo "[INFO] Compiling java files to classes"
	$(JC) $(JFLAGS) $(SRC_DIR)/*.java

jar: compile
	@echo "[INFO] Creating jar file"
	$(JAR) $(TARGET_DIR)/$(PROJECT_NAME).jar $(CLASSES)