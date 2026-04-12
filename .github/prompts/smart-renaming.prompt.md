You are working on a codebase where files inside the folder $ARGUMENT need to be renamed, reordered, and fixed.

### Goal:
1. Ensure all files in the folder are ordered in ascending alphabetical sequence based on their filename prefix.
2. Each file must start with a single uppercase alphabet prefix followed by an space and a descriptive name.:
   Format: <ALPHABET> <Descriptive Name>.md

3. If multiple files currently share the same starting alphabet, rename them so that each file gets a unique sequential alphabet.
4. If the descriptive part of the filename is a interrogative add a "?" at the end of the description.
5. If the descriptive part of the filename is a statement, just enhance the description without adding any punctuation.
6. Ensure the links of the file at the end of the file is correctly pointing the next file in the sequence and the previous file in the sequence and not randomly to any files.
7. Use html anchor tags and ensure the links description is correctly describing the file it is pointing to. For example, if the next file is "B Stream Characteristics.md" then the link description should be "Next: B Stream Characteristics.md" and not just "Next: SomeName.md"
8. Ensure the previous link is left aligned and the next link is right aligned using HTML table formatting.
9. IMPORTANT: Ensure links are working properly using href of the html for this use case.

### Example:
Current:
A_SomeNameX.md
A_SomeNameY.md
A_SomeNameZ.md

Expected:
A SomeNameX.md
B SomeNameY.md
C SomeNameZ.md

---

### Smart Renaming (IMPORTANT):
- Improve the filename after the prefix to be meaningful, clean, and consistent.
- Capitalize the first letter of each word in the file names.
- Don't use hyphens use spaces to separate words in the descriptive part of the filename.
- Derive better names from:
    - File content (title, headings, or main topic)
    - Existing filename (if already meaningful)

### Examples:
A_tmp.md → A Introduction To System Design.md  
B_notes.md → B Database Indexing Strategies.md

### Rules for naming:
- Lowercase only (except prefix)
- Remove special characters
- Keep names concise but descriptive
- Do NOT change file extensions

---

### Navigation Links Fix (CRITICAL):
Each `.md` file contains navigation links at the end (e.g., Previous / Next links).

After renaming:
- Update all navigation links so they correctly point to the renamed files.
- Ensure no broken links exist.
- Maintain logical sequence:
    - "Previous" → previous file in alphabetical order
    - "Next" → next file in alphabetical order

---

### Constraints:
- Preserve content integrity inside files (except navigation links update).
- Do NOT overwrite files accidentally.
- Handle edge cases:
    - Single file
    - Already correctly named files
    - Missing or malformed navigation links

---

### Output Requirements:
Provide a complete working script (preferably Python, Bash, or Node.js) that:
1. Reads all files in $ARGUMENT
2. Generates improved filenames
3. Renames files safely
4. Updates navigation links inside `.md` files
5. Prints a mapping:
   OLD_FILENAME → NEW_FILENAME

---

### Quality Requirements:
- Code must be production-safe and idempotent
- Use clear logic and comments
- Avoid hardcoding filenames
- Ensure cross-platform compatibility (if possible)