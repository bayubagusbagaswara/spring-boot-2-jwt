# Spring Boot and Spring Security


# Basic Auth

1. Pertama, dari sisi Client akan mengirimkan request `HTTP Request (GET)` ke Backend
2. Kedua, di dalam Backend akan melakukan proses `Check Authorization`
3. Ketiga, Backend tidak berhasil mengauthorization, maka akan dikirimkan response `Return 401 UNAUTHORIZED`
4. Keempat, Client akan mengirimkan request lagi, tetapi berisi username dan password, `HTTP Request (GET) => Basic64 username:password`
5. Kelima, backend akan check username dan password nya apakah cocok
6. Keenam, jika username dan password cocok, maka backend akan kirimkan response `Response: 200 OK`

