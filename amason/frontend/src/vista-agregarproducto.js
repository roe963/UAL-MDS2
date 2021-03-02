import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-agregarproducto`
 *
 * VistaAgregarproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaAgregarproducto extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-agregarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarproducto.is, VistaAgregarproducto);
