#!/bin/bash

# Eliminar archivos JavaScript antiguos
rm -f src/ai/*.js
rm -f src/lecciones/*.js
rm -f src/modules/*.js

# Eliminar carpetas vacías
rmdir src/ai src/lecciones src/modules 2>/dev/null || true
