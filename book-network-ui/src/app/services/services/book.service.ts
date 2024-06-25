/* tslint:disable */
/* eslint-disable */
import { HttpClient, HttpContext } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { BaseService } from '../base-service';
import { ApiConfiguration } from '../api-configuration';
import { StrictHttpResponse } from '../strict-http-response';

import { approvedReturnBorrowBook } from '../fn/book/approved-return-borrow-book';
import { ApprovedReturnBorrowBook$Params } from '../fn/book/approved-return-borrow-book';
import { BookResponse } from '../models/book-response';
import { borrowBook } from '../fn/book/borrow-book';
import { BorrowBook$Params } from '../fn/book/borrow-book';
import { findAllBooks } from '../fn/book/find-all-books';
import { FindAllBooks$Params } from '../fn/book/find-all-books';
import { findALlBooksByOwner } from '../fn/book/find-a-ll-books-by-owner';
import { FindALlBooksByOwner$Params } from '../fn/book/find-a-ll-books-by-owner';
import { findALlBorrowedBooks } from '../fn/book/find-a-ll-borrowed-books';
import { FindALlBorrowedBooks$Params } from '../fn/book/find-a-ll-borrowed-books';
import { findALlReturnedBooks } from '../fn/book/find-a-ll-returned-books';
import { FindALlReturnedBooks$Params } from '../fn/book/find-a-ll-returned-books';
import { findBookById } from '../fn/book/find-book-by-id';
import { FindBookById$Params } from '../fn/book/find-book-by-id';
import { PageResponseBookResponse } from '../models/page-response-book-response';
import { PageResponseBorrowedBooksResponse } from '../models/page-response-borrowed-books-response';
import { returnBorrowBook } from '../fn/book/return-borrow-book';
import { ReturnBorrowBook$Params } from '../fn/book/return-borrow-book';
import { saveBook } from '../fn/book/save-book';
import { SaveBook$Params } from '../fn/book/save-book';
import { updateArchivedStatus } from '../fn/book/update-archived-status';
import { UpdateArchivedStatus$Params } from '../fn/book/update-archived-status';
import { updateSharableStatus } from '../fn/book/update-sharable-status';
import { UpdateSharableStatus$Params } from '../fn/book/update-sharable-status';
import { uploadBookCoverPicture } from '../fn/book/upload-book-cover-picture';
import { UploadBookCoverPicture$Params } from '../fn/book/upload-book-cover-picture';

@Injectable({ providedIn: 'root' })
export class BookService extends BaseService {
  constructor(config: ApiConfiguration, http: HttpClient) {
    super(config, http);
  }

  /** Path part for operation `findAllBooks()` */
  static readonly FindAllBooksPath = '/books';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findAllBooks()` instead.
   *
   * This method doesn't expect any request body.
   */
  findAllBooks$Response(params?: FindAllBooks$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseBookResponse>> {
    return findAllBooks(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findAllBooks$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findAllBooks(params?: FindAllBooks$Params, context?: HttpContext): Observable<PageResponseBookResponse> {
    return this.findAllBooks$Response(params, context).pipe(
      map((r: StrictHttpResponse<PageResponseBookResponse>): PageResponseBookResponse => r.body)
    );
  }

  /** Path part for operation `saveBook()` */
  static readonly SaveBookPath = '/books';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `saveBook()` instead.
   *
   * This method sends `application/json` and handles request body of type `application/json`.
   */
  saveBook$Response(params: SaveBook$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return saveBook(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `saveBook$Response()` instead.
   *
   * This method sends `application/json` and handles request body of type `application/json`.
   */
  saveBook(params: SaveBook$Params, context?: HttpContext): Observable<number> {
    return this.saveBook$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `uploadBookCoverPicture()` */
  static readonly UploadBookCoverPicturePath = '/books/cover/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `uploadBookCoverPicture()` instead.
   *
   * This method sends `multipart/from-data` and handles request body of type `multipart/from-data`.
   */
  uploadBookCoverPicture$Response(params: UploadBookCoverPicture$Params, context?: HttpContext): Observable<StrictHttpResponse<{
}>> {
    return uploadBookCoverPicture(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `uploadBookCoverPicture$Response()` instead.
   *
   * This method sends `multipart/from-data` and handles request body of type `multipart/from-data`.
   */
  uploadBookCoverPicture(params: UploadBookCoverPicture$Params, context?: HttpContext): Observable<{
}> {
    return this.uploadBookCoverPicture$Response(params, context).pipe(
      map((r: StrictHttpResponse<{
}>): {
} => r.body)
    );
  }

  /** Path part for operation `borrowBook()` */
  static readonly BorrowBookPath = '/books/borrow/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `borrowBook()` instead.
   *
   * This method doesn't expect any request body.
   */
  borrowBook$Response(params: BorrowBook$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return borrowBook(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `borrowBook$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  borrowBook(params: BorrowBook$Params, context?: HttpContext): Observable<number> {
    return this.borrowBook$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `updateSharableStatus()` */
  static readonly UpdateSharableStatusPath = '/books/shareable/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `updateSharableStatus()` instead.
   *
   * This method doesn't expect any request body.
   */
  updateSharableStatus$Response(params: UpdateSharableStatus$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return updateSharableStatus(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `updateSharableStatus$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  updateSharableStatus(params: UpdateSharableStatus$Params, context?: HttpContext): Observable<number> {
    return this.updateSharableStatus$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `returnBorrowBook()` */
  static readonly ReturnBorrowBookPath = '/books/borrow/return/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `returnBorrowBook()` instead.
   *
   * This method doesn't expect any request body.
   */
  returnBorrowBook$Response(params: ReturnBorrowBook$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return returnBorrowBook(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `returnBorrowBook$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  returnBorrowBook(params: ReturnBorrowBook$Params, context?: HttpContext): Observable<number> {
    return this.returnBorrowBook$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `approvedReturnBorrowBook()` */
  static readonly ApprovedReturnBorrowBookPath = '/books/borrow/return/approved/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `approvedReturnBorrowBook()` instead.
   *
   * This method doesn't expect any request body.
   */
  approvedReturnBorrowBook$Response(params: ApprovedReturnBorrowBook$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return approvedReturnBorrowBook(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `approvedReturnBorrowBook$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  approvedReturnBorrowBook(params: ApprovedReturnBorrowBook$Params, context?: HttpContext): Observable<number> {
    return this.approvedReturnBorrowBook$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `updateArchivedStatus()` */
  static readonly UpdateArchivedStatusPath = '/books/archived/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `updateArchivedStatus()` instead.
   *
   * This method doesn't expect any request body.
   */
  updateArchivedStatus$Response(params: UpdateArchivedStatus$Params, context?: HttpContext): Observable<StrictHttpResponse<number>> {
    return updateArchivedStatus(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `updateArchivedStatus$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  updateArchivedStatus(params: UpdateArchivedStatus$Params, context?: HttpContext): Observable<number> {
    return this.updateArchivedStatus$Response(params, context).pipe(
      map((r: StrictHttpResponse<number>): number => r.body)
    );
  }

  /** Path part for operation `findBookById()` */
  static readonly FindBookByIdPath = '/books/{book-id}';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findBookById()` instead.
   *
   * This method doesn't expect any request body.
   */
  findBookById$Response(params: FindBookById$Params, context?: HttpContext): Observable<StrictHttpResponse<BookResponse>> {
    return findBookById(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findBookById$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findBookById(params: FindBookById$Params, context?: HttpContext): Observable<BookResponse> {
    return this.findBookById$Response(params, context).pipe(
      map((r: StrictHttpResponse<BookResponse>): BookResponse => r.body)
    );
  }

  /** Path part for operation `findALlReturnedBooks()` */
  static readonly FindALlReturnedBooksPath = '/books/returned';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findALlReturnedBooks()` instead.
   *
   * This method doesn't expect any request body.
   */
  findALlReturnedBooks$Response(params?: FindALlReturnedBooks$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseBorrowedBooksResponse>> {
    return findALlReturnedBooks(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findALlReturnedBooks$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findALlReturnedBooks(params?: FindALlReturnedBooks$Params, context?: HttpContext): Observable<PageResponseBorrowedBooksResponse> {
    return this.findALlReturnedBooks$Response(params, context).pipe(
      map((r: StrictHttpResponse<PageResponseBorrowedBooksResponse>): PageResponseBorrowedBooksResponse => r.body)
    );
  }

  /** Path part for operation `findALlBooksByOwner()` */
  static readonly FindALlBooksByOwnerPath = '/books/owner';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findALlBooksByOwner()` instead.
   *
   * This method doesn't expect any request body.
   */
  findALlBooksByOwner$Response(params?: FindALlBooksByOwner$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseBookResponse>> {
    return findALlBooksByOwner(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findALlBooksByOwner$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findALlBooksByOwner(params?: FindALlBooksByOwner$Params, context?: HttpContext): Observable<PageResponseBookResponse> {
    return this.findALlBooksByOwner$Response(params, context).pipe(
      map((r: StrictHttpResponse<PageResponseBookResponse>): PageResponseBookResponse => r.body)
    );
  }

  /** Path part for operation `findALlBorrowedBooks()` */
  static readonly FindALlBorrowedBooksPath = '/books/borrowed';

  /**
   * This method provides access to the full `HttpResponse`, allowing access to response headers.
   * To access only the response body, use `findALlBorrowedBooks()` instead.
   *
   * This method doesn't expect any request body.
   */
  findALlBorrowedBooks$Response(params?: FindALlBorrowedBooks$Params, context?: HttpContext): Observable<StrictHttpResponse<PageResponseBorrowedBooksResponse>> {
    return findALlBorrowedBooks(this.http, this.rootUrl, params, context);
  }

  /**
   * This method provides access only to the response body.
   * To access the full response (for headers, for example), `findALlBorrowedBooks$Response()` instead.
   *
   * This method doesn't expect any request body.
   */
  findALlBorrowedBooks(params?: FindALlBorrowedBooks$Params, context?: HttpContext): Observable<PageResponseBorrowedBooksResponse> {
    return this.findALlBorrowedBooks$Response(params, context).pipe(
      map((r: StrictHttpResponse<PageResponseBorrowedBooksResponse>): PageResponseBorrowedBooksResponse => r.body)
    );
  }

}
