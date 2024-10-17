#!/bin/sh
javac --module-source-path . -d modules $(fd --type=f --glob '*.java')
