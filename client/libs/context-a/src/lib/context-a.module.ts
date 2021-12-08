import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ContextAComponent } from './context-a/context-a.component';
import { Route, RouterModule } from '@angular/router';
import { ExampleComponent } from './context-a/example/example.component';

const routes: Route[] = [
  {
    path: '',
    component: ContextAComponent,
    children: [
      {
        path: 'example',
        component: ExampleComponent
      }

    ]
  },
];

@NgModule({
  imports: [CommonModule, RouterModule.forChild(routes)],
  declarations: [
    ContextAComponent,
    ExampleComponent
  ],
  exports: [
    ContextAComponent
  ],
})
export class ContextAModule {}
