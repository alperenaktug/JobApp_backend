# Job Application REST API

Bu proje, iş ilanları yönetimi için geliştirilmiş bir Spring Boot REST API uygulamasıdır.
Frontend tarafı ile (React.js) entegre çalışarak iş ilanı ekleme, güncelleme, silme ve listeleme işlemlerini sağlar. Bu API'ler ile iş ilanları üzerinde temel **CRUD** (Create, Read, Update, Delete) operasyonları gerçekleştirebilirsiniz.

🛠 Kullanılan Teknolojiler

Java 17+

Spring Boot

Spring Web

Spring Security

Spring Data JPA

Hibernate

PostgreSQL Driver

Spring DevTools

Lombok

Maven

RESTful API yapısı

---

## API Endpoints

### 1. Tüm İş İlanlarını Getir
- **Endpoint:** `GET /jobPosts`
- **Açıklama:** Sistemdeki tüm iş ilanlarını liste halinde döndürür.
- **Örnek Yanıt (Response):**
  ```json
  [
    {
      "postId": 1,
      "postProfile": "Yazılım Geliştirici",
      "postDesc": "Tutkulu bir yazılım geliştirici arıyoruz...",
      "postTechStack": ["Java", "Spring Boot", "React"]
    },
    {
      "postId": 2,
      "postProfile": "Veri Bilimci",
      "postDesc": "Deneyimli bir veri bilimci arayışımız var...",
      "postTechStack": ["Python", "Pandas", "Scikit-learn"]
    }
  ]

### 2. Belirli Bir İş İlanını Getir

    Endpoint: GET /jobPost/{postId}

    Açıklama: Belirtilen ID'ye sahip tek bir iş ilanını getirir.

    Parametre:

        postId: Getirilmek istenen iş ilanının ID'si.

    Örnek Yanıt (Response):
    JSON

    {
      "postId": 1,
      "postProfile": "Yazılım Geliştirici",
      "postDesc": "Tutkulu bir yazılım geliştirici arıyoruz...",
      "postTechStack": ["Java", "Spring Boot", "React"]
    }

### 3. Yeni İş İlanı Ekle

    Endpoint: POST /jobPost

    Açıklama: Sisteme yeni bir iş ilanı ekler.

    İstek Gövdesi (Request Body): Oluşturulacak iş ilanını temsil eden bir JSON objesi gönderilmelidir.

    Örnek İstek Gövdesi:
    JSON

{
  "postId": 3,
  "postProfile": "DevOps Mühendisi",
  "postDesc": "DevOps ekibimize katılacak ekip arkadaşı arıyoruz...",
  "postTechStack": ["Docker", "Kubernetes", "AWS"]
}

Örnek Yanıt (Response):
JSON

    {
      "postId": 3,
      "postProfile": "DevOps Mühendisi",
      "postDesc": "DevOps ekibimize katılacak ekip arkadaşı arıyoruz...",
      "postTechStack": ["Docker", "Kubernetes", "AWS"]
    }

### 4. İş İlanını Güncelle

    Endpoint: PUT /jobPost

    Açıklama: Var olan bir iş ilanını günceller. İstek gövdesinde gönderilen JSON objesi, postId alanına göre ilgili ilanı tamamen değiştirir.

    İstek Gövdesi (Request Body): Güncellenmiş iş ilanını temsil eden bir JSON objesi.

    Örnek İstek Gövdesi:
    JSON

{
  "postId": 1,
  "postProfile": "Kıdemli Yazılım Geliştirici",
  "postDesc": "Pozisyon için güncellenmiş açıklama...",
  "postTechStack": ["Java", "Spring Boot", "React", "AWS"]
}

Örnek Yanıt (Response):
JSON

    {
      "postId": 1,
      "postProfile": "Kıdemli Yazılım Geliştirici",
      "postDesc": "Pozisyon için güncellenmiş açıklama...",
      "postTechStack": ["Java", "Spring Boot", "React", "AWS"]
    }

### 5. İş İlanını Sil

    Endpoint: DELETE /jobPost/{postId}

    Açıklama: Belirtilen ID'ye sahip iş ilanını siler.

    Parametre:

        postId: Silinmek istenen iş ilanının ID'si.

    Örnek Yanıt (Response):

    "Deleted"

### 6. Örnek Veri Yükle

    Endpoint: GET /load

    Açıklama: Uygulamaya başlangıç için bazı örnek iş ilanlarını yükleyen yardımcı bir endpoint'tir.

    Örnek Yanıt (Response):

    "success"
