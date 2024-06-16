/* tslint:disable */
/* eslint-disable */
import { Book } from './book';
import { User } from './user';
export interface BookTransactionHistory {
  book?: Book;
  createdBy?: number;
  createdDate?: string;
  id?: number;
  lastModifiedBy?: number;
  lastModifiedDate?: string;
  returnApproved?: boolean;
  returned?: boolean;
  user?: User;
}
