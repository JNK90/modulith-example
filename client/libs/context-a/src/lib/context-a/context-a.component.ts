import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'client-context-a',
  templateUrl: './context-a.component.html',
  styleUrls: ['./context-a.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ContextAComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
