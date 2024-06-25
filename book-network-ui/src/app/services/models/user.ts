/* tslint:disable */
/* eslint-disable */
import { Book } from '../models/book';
import { BookTransactionHistory } from '../models/book-transaction-history';
import { GrantedAuthority } from '../models/granted-authority';
import { Role } from '../models/role';
export interface User {
  accountLocked?: boolean;
  accountNonExpired?: boolean;
  accountNonLocked?: boolean;
  authorities?: Array<GrantedAuthority>;
  books?: Array<Book>;
  createdDate?: string;
  credentialsNonExpired?: boolean;
  dateOfBirth?: string;
  email?: string;
  enabled?: boolean;
  firstname?: string;
  fullName?: string;
  histories?: Array<BookTransactionHistory>;
  id?: number;
  lastModifiedDate?: string;
  lastname?: string;
  name?: string;
  password?: string;
  roles?: Array<Role>;
  username?: string;
}
