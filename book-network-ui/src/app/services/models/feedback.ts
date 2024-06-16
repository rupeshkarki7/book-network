/* tslint:disable */
/* eslint-disable */
import { Book } from './book';
export interface Feedback {
  book?: Book;
  comment?: string;
  createdBy?: number;
  createdDate?: string;
  id?: number;
  lastModifiedBy?: number;
  lastModifiedDate?: string;
  note?: number;
}
