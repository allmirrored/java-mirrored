#!/bin/bash
set -euo pipefail
DIR="$1"
EXT="$2"
COUNT=$(find "$DIR" -name "*.$EXT" | wc -l)
echo "У $DIR файлів .$EXT: $COUNT"
