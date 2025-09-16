import hashlib

new_flag_part2_plaintext = "w4s_f1n1sh3d}"
salt = "SuperSecretLegacySaltXYZ"

combined_string = new_flag_part2_plaintext + salt
new_calculated_hash = hashlib.md5(combined_string.encode()).hexdigest()

print(f"New plaintext Flag Part 2: {new_flag_part2_plaintext}")
print(f"Salt: {salt}")
print(f"New calculated MD5 Hash: {new_calculated_hash}")