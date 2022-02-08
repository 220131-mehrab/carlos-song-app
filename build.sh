#!/bin/bash

build() {
	javac -d bin src/SongApp.java
}

run() {
	java SongApp $@
}

$@
