import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-context-menu/src/vaadin-context-menu.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-ofertas.js';

class VistaCliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-context-menu></vaadin-context-menu>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-vertical-layout theme="spacing" style="padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); align-self: center;">
   <h2 style="align-self: center;">Amason</h2>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button>
    🏠
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1; flex-shrink: 1;">
   <vaadin-text-field style="flex-grow: 0; flex-shrink: 1; align-self: stretch; padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs); padding-left: var(--lumo-space-xl); padding-right: var(--lumo-space-xs);"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button>
    🔍
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
   <vaadin-button>
    🛒
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-m);">
   <vaadin-button>
     Usuario 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-form-layout style="flex-grow: 1; align-self: stretch;">
  <vista-ofertas></vista-ofertas>
 </vaadin-form-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-select value="Item one">
    <template>
     <vaadin-list-box selected="0">
      <vaadin-item selected>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
  </vaadin-horizontal-layout>
  <vaadin-form-layout style="flex-grow: 1;"></vaadin-form-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout class="footer" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCliente.is, VistaCliente);
