import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaymenuitemComponent } from './displaymenuitem.component';

describe('DisplaymenuitemComponent', () => {
  let component: DisplaymenuitemComponent;
  let fixture: ComponentFixture<DisplaymenuitemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DisplaymenuitemComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplaymenuitemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
