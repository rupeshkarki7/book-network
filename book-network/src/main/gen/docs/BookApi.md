# BookApi

All URIs are relative to *http://localhost:8088/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approvedReturnBorrowBook**](BookApi.md#approvedReturnBorrowBook) | **PATCH** /books/borrow/return/approved/{book-id} |  |
| [**borrowBook**](BookApi.md#borrowBook) | **POST** /books/borrow/{book-id} |  |
| [**findALlBooksByOwner**](BookApi.md#findALlBooksByOwner) | **GET** /books/owner |  |
| [**findALlBorrowedBooks**](BookApi.md#findALlBorrowedBooks) | **GET** /books/borrowed |  |
| [**findALlReturnedBooks**](BookApi.md#findALlReturnedBooks) | **GET** /books/returned |  |
| [**findAllBooks**](BookApi.md#findAllBooks) | **GET** /books |  |
| [**findBookById**](BookApi.md#findBookById) | **GET** /books/{book-id} |  |
| [**returnBorrowBook**](BookApi.md#returnBorrowBook) | **PATCH** /books/borrow/return/{book-id} |  |
| [**saveBook**](BookApi.md#saveBook) | **POST** /books |  |
| [**updateArchivedStatus**](BookApi.md#updateArchivedStatus) | **PATCH** /books/archived/{book-id} |  |
| [**updateSharableStatus**](BookApi.md#updateSharableStatus) | **PATCH** /books/shareable/{book-id} |  |
| [**uploadBookCoverPicture**](BookApi.md#uploadBookCoverPicture) | **POST** /books/cover/{book-id} |  |


<a name="approvedReturnBorrowBook"></a>
# **approvedReturnBorrowBook**
> Integer approvedReturnBorrowBook(bookId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    try {
      Integer result = apiInstance.approvedReturnBorrowBook(bookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#approvedReturnBorrowBook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="borrowBook"></a>
# **borrowBook**
> Integer borrowBook(bookId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    try {
      Integer result = apiInstance.borrowBook(bookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#borrowBook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="findALlBooksByOwner"></a>
# **findALlBooksByOwner**
> PageResponseBookResponse findALlBooksByOwner(page, size)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 10; // Integer | 
    try {
      PageResponseBookResponse result = apiInstance.findALlBooksByOwner(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#findALlBooksByOwner");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

[**PageResponseBookResponse**](PageResponseBookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="findALlBorrowedBooks"></a>
# **findALlBorrowedBooks**
> PageResponseBorrowedBooksResponse findALlBorrowedBooks(page, size)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 10; // Integer | 
    try {
      PageResponseBorrowedBooksResponse result = apiInstance.findALlBorrowedBooks(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#findALlBorrowedBooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

[**PageResponseBorrowedBooksResponse**](PageResponseBorrowedBooksResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="findALlReturnedBooks"></a>
# **findALlReturnedBooks**
> PageResponseBorrowedBooksResponse findALlReturnedBooks(page, size)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 10; // Integer | 
    try {
      PageResponseBorrowedBooksResponse result = apiInstance.findALlReturnedBooks(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#findALlReturnedBooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

[**PageResponseBorrowedBooksResponse**](PageResponseBorrowedBooksResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="findAllBooks"></a>
# **findAllBooks**
> PageResponseBookResponse findAllBooks(page, size)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 10; // Integer | 
    try {
      PageResponseBookResponse result = apiInstance.findAllBooks(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#findAllBooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 10] |

### Return type

[**PageResponseBookResponse**](PageResponseBookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="findBookById"></a>
# **findBookById**
> BookResponse findBookById(bookId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    try {
      BookResponse result = apiInstance.findBookById(bookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#findBookById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="returnBorrowBook"></a>
# **returnBorrowBook**
> Integer returnBorrowBook(bookId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    try {
      Integer result = apiInstance.returnBorrowBook(bookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#returnBorrowBook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="saveBook"></a>
# **saveBook**
> Integer saveBook(bookRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    BookRequest bookRequest = new BookRequest(); // BookRequest | 
    try {
      Integer result = apiInstance.saveBook(bookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#saveBook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookRequest** | [**BookRequest**](BookRequest.md)|  | |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateArchivedStatus"></a>
# **updateArchivedStatus**
> Integer updateArchivedStatus(bookId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    try {
      Integer result = apiInstance.updateArchivedStatus(bookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#updateArchivedStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSharableStatus"></a>
# **updateSharableStatus**
> Integer updateSharableStatus(bookId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    try {
      Integer result = apiInstance.updateSharableStatus(bookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#updateSharableStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="uploadBookCoverPicture"></a>
# **uploadBookCoverPicture**
> Object uploadBookCoverPicture(bookId, _file)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8088/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookApi apiInstance = new BookApi(defaultClient);
    Integer bookId = 56; // Integer | 
    File _file = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.uploadBookCoverPicture(bookId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#uploadBookCoverPicture");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookId** | **Integer**|  | |
| **_file** | **File**|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/from-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

