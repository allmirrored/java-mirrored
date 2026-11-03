# Source this file in Git Bash. Tool binaries stay outside the repository.
study_tools='/c/Users/cauft/.codex/visualizations/2026/11/03/01a1a227-cb3a-7e22-ba0e-8081731e92d4/tools'
if [[ ! -x "$study_tools/python/python.exe" ]]; then
  printf 'Local Python is missing: %s\n' "$study_tools/python/python.exe"
  return 1
fi
export JAVA_HOME="$(cygpath -w "$study_tools/jdk-25.0.5+8")"
export PATH="$study_tools/python:$study_tools/jdk-25.0.5+8/bin:$study_tools/apache-maven-3.9.11/bin:$PATH"
printf 'Study environment ready. Git Bash; Python, JDK 25, Maven.\n'
unset study_tools
