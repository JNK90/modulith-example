import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'client-context-b',
  templateUrl: './context-b.component.html',
  styleUrls: ['./context-b.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ContextBComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
