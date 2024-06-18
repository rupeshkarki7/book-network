/*
 * OpenApi Specification - XXMORTIS
 * OpenApi documentation for Spring security
 *
 * The version of the OpenAPI document: 1.0
 * Contact: rpshkarki@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.client.model.Book;
import org.openapitools.client.model.User;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * BookTransactionHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-16T06:49:34.154101600+05:45[Asia/Katmandu]")
public class BookTransactionHistory {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private LocalDate createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private LocalDate lastModifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private Integer lastModifiedBy;

  public static final String SERIALIZED_NAME_RETURNED = "returned";
  @SerializedName(SERIALIZED_NAME_RETURNED)
  private Boolean returned;

  public static final String SERIALIZED_NAME_RETURN_APPROVED = "returnApproved";
  @SerializedName(SERIALIZED_NAME_RETURN_APPROVED)
  private Boolean returnApproved;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_BOOK = "book";
  @SerializedName(SERIALIZED_NAME_BOOK)
  private Book book;

  public BookTransactionHistory() {
  }

  public BookTransactionHistory id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public BookTransactionHistory createdDate(LocalDate createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }


  public BookTransactionHistory lastModifiedDate(LocalDate lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public BookTransactionHistory createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public BookTransactionHistory lastModifiedBy(Integer lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(Integer lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public BookTransactionHistory returned(Boolean returned) {
    
    this.returned = returned;
    return this;
  }

   /**
   * Get returned
   * @return returned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReturned() {
    return returned;
  }


  public void setReturned(Boolean returned) {
    this.returned = returned;
  }


  public BookTransactionHistory returnApproved(Boolean returnApproved) {
    
    this.returnApproved = returnApproved;
    return this;
  }

   /**
   * Get returnApproved
   * @return returnApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReturnApproved() {
    return returnApproved;
  }


  public void setReturnApproved(Boolean returnApproved) {
    this.returnApproved = returnApproved;
  }


  public BookTransactionHistory user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public BookTransactionHistory book(Book book) {
    
    this.book = book;
    return this;
  }

   /**
   * Get book
   * @return book
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Book getBook() {
    return book;
  }


  public void setBook(Book book) {
    this.book = book;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookTransactionHistory bookTransactionHistory = (BookTransactionHistory) o;
    return Objects.equals(this.id, bookTransactionHistory.id) &&
        Objects.equals(this.createdDate, bookTransactionHistory.createdDate) &&
        Objects.equals(this.lastModifiedDate, bookTransactionHistory.lastModifiedDate) &&
        Objects.equals(this.createdBy, bookTransactionHistory.createdBy) &&
        Objects.equals(this.lastModifiedBy, bookTransactionHistory.lastModifiedBy) &&
        Objects.equals(this.returned, bookTransactionHistory.returned) &&
        Objects.equals(this.returnApproved, bookTransactionHistory.returnApproved) &&
        Objects.equals(this.user, bookTransactionHistory.user) &&
        Objects.equals(this.book, bookTransactionHistory.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, lastModifiedDate, createdBy, lastModifiedBy, returned, returnApproved, user, book);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookTransactionHistory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    returnApproved: ").append(toIndentedString(returnApproved)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("createdDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("createdBy");
    openapiFields.add("lastModifiedBy");
    openapiFields.add("returned");
    openapiFields.add("returnApproved");
    openapiFields.add("user");
    openapiFields.add("book");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BookTransactionHistory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BookTransactionHistory.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookTransactionHistory is not found in the empty JSON string", BookTransactionHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BookTransactionHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookTransactionHistory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        User.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      // validate the optional field `book`
      if (jsonObj.get("book") != null && !jsonObj.get("book").isJsonNull()) {
        Book.validateJsonObject(jsonObj.getAsJsonObject("book"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookTransactionHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookTransactionHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookTransactionHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookTransactionHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<BookTransactionHistory>() {
           @Override
           public void write(JsonWriter out, BookTransactionHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookTransactionHistory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookTransactionHistory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookTransactionHistory
  * @throws IOException if the JSON string is invalid with respect to BookTransactionHistory
  */
  public static BookTransactionHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookTransactionHistory.class);
  }

 /**
  * Convert an instance of BookTransactionHistory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
