[![Work in MakeCode](https://classroom.github.com/assets/work-in-make-code-c53f0c86300af1a64cdd5dc830e2509efd17c8cb483a722cacaee84d10eb8ec9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=5298052&assignment_repo_type=AssignmentRepo)
# İlk Spring Boot Uygulamam Ödevi

Bu repo *İlk Spring Boot Uygulamam Ödevi* için oluşturulmuştur.

## Açıklama

03/07/2021 tarihli dersimizde gördüğümüz ilk spring boot uygulamasında java paketinin altında aşağıdaki çok katmanlı yapıyı oluşturmuştuk:

```
-> dto
-> service
-> controller
- App.java
```

Derste anlatıldığı gibi pom.xml güncellemeli ve yukardaki yapıyı oluşturmalısınız. Buna ek olarak App.java dosyasında `public class App {` satırının üstüne `@SpringBootApplication` deklarasyonu ekleyiniz. Ayrıca `main` metoduna `SpringApplication.run(MyApp.class, args);` satırını eklemelisiniz.

## Görevler

- DTO katmanında `ShapeDto` diye bir DTO sınıfı olusturunuz.
	- iki adet `x` ve `y` adında `Float` değişkeni oluşturunuz.
	- Integer türünde `id` adından bir değişken oluşturunuz.
	- Boş Constructor ve tüm değişkenlerin olduğu constructor oluşturunuz.
	- Getter ve Setter metodlarını oluşturunuz.
	
- Service katmanında ShapeService diye bir servis sınıfı oluşturunuz.
	- Bu servis bir `ArrayList` tutmalı ve adı da `shapes` olmalı.
	- Bu servis'de `listShape`, `getShape`, `addShape`, `updateShape`, `deleteShape` adından metodları olmalı.
	- `listShape` `shapes` listesini döndürmeli
	- `getShape(int id)` shapes listesindeki id'ye sahip ShapeDto döndürmelidir.
	- `addShape(ShapeDto shapeDto)` `shapes` listesine shapeDto objesi eklenmeli ve id güncellemesi yapıldıktan sonra kendisini döndürmelidir. `id`'nin tekil olmasın dikkat etmelisiniz. Yoksa `updateShape` ve `getShape` işlemleri doğru çalışmaz.
	- `updateShape(ShapeDto shapeDto)` `shapes` listesine shapeDto objesi bulunuyorsa güncellenmeli. (`id`'nin güncellenmediğine emil olmalısınız. Yoksa doğru güncelleme yapamazsınız.) ve kendisini döndürmelidir.
	- `deleteShape(ShapeDto shapeDto)` `shapes` listesinden shapeDto objesini çıkarmalı ve kendisini döndürmelidir.
	
- Controller katmanında ShapeController diye bir controller sınıfı oluşturunuz.
	- Bu controller'un `listShape`, `getShape`, `addShape`, `updateShape`, `deleteShape` adında metodları olmalı. Bu metodlar `ResponseEntity<?>` türünde obje döndürmelidir.
	- Bu metodlar, dersteki anlatımlar gibi `@GetMapping`, `@PostMapping`, `@UpdateMapping`, `@DeletMapping` tanımlamalarına sahip olmalıdır.
	- `ShapeService` türünde `shapeService` adında bir obje oluşturulmalıdır.
	- listShape => shapeService.listShape metodunu kullanmalıdır.
	- getShape => shapeService.getShape metodunu kullanmalıdır.
	- addShape => shapeService.addShape metodunu kullanmalıdır.
	- updateShape => shapeService.updateShape metodunu kullanmalıdır.
	- deleteShape => shapeService.deleteShape metodunu kullanmalıdır.
	- `ShapeController` sınıfına `@RequestMapping` ile Rota grubu eklenmelidir.
	- `ShapeController` sınıfına `@RestController` eklenmelidir.
	
## Genel Şartlar

- Ödevde belirtilen katmanlar dışında katman **oluşturulmamalıdır**.
- Ödevde belirtilen katmanlar dışında metod **oluşturulmamalıdır**.
- Ödevde belirtilen katmanlar dışında sınıf **oluşturulmamalıdır**.
