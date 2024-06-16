/* tslint:disable */
/* eslint-disable */
import { Book } from './book';
import { BookTransactionHistory } from './book-transaction-history';
import { GrantedAuthority } from './granted-authority';
import { Role } from './role';
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
