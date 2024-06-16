/* tslint:disable */
/* eslint-disable */
import { User } from './user';
export interface BookResponse {
  archived?: boolean;
  authorName?: string;
  cover?: Array<string>;
  id?: number;
  isbn?: string;
  owner?: User;
  rate?: number;
  shareable?: boolean;
  synopsis?: string;
  title?: string;
}
