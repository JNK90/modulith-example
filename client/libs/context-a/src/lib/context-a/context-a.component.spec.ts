import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContextAComponent } from './context-a.component';

describe('ContextAComponent', () => {
  let component: ContextAComponent;
  let fixture: ComponentFixture<ContextAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContextAComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContextAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
