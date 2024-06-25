/* tslint:disable */
/* eslint-disable */
import { Book } from '../models/book';
import { User } from '../models/user';
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
