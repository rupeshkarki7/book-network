/* tslint:disable */
/* eslint-disable */
import {BookTransactionHistory} from './book-transaction-history';
import {Feedback} from './feedback';
import {User} from './user';

export interface Book {
  archived?: boolean;
  authorName?: string;
  bookCover?: string;
  createdBy?: number;
  createdDate?: string;
  feedbacks?: Array<Feedback>;
  histories?: Array<BookTransactionHistory>;
  id?: number;
  isbn?: string;
  lastModifiedBy?: number;
  lastModifiedDate?: string;
  owner?: User;
  rate?: number;
  shareable?: boolean;
  synopsis?: string;
  title?: string;
}
