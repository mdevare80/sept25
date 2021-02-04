import hashlib;
hash = hashlib.sha256("Hello".encode()).hexdigest()
print(hash)