import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';
import { map, Observable } from 'rxjs';

type Message = {
  content: string;
}

@Component({
  selector: 'client-context-b',
  templateUrl: './context-b.component.html',
  styleUrls: ['./context-b.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ContextBComponent implements OnInit {

  message$!: Observable<string>;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.message$ = this.http.get<Message>('/contextB/message').pipe(map(res => res.content));
  }

}
