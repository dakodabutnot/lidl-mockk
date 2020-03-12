# lidl-mockk

[![](https://jitpack.io/v/dakodabutnot/lidl-mockk.svg)](https://jitpack.io/#dakodabutnot/lidl-mockk)

## installation
add repository to build file
```kotlin
maven("https://jitpack.io")
```
and add dependency
```kotlin
testImplementation("com.github.dakodabutnot:lidl-mockk:1.0")
```

## usage

*relaxed mockk*
```kotlin
val book: Book = relaxedMockk()
// instead of
val book: Book = mockk(relaxed = true)
```

*multi mockk*
```kotlin
val books: List<Book> = multiMockk(10) // list of 10 mocks
// instead of 
val books: List<Book> = (1..10).map { mockk() }
```
